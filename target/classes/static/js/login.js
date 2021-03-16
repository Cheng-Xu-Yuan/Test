var form,layer
layui.use(['form','layer'],function(){
    form = layui.form;
    layer = layui.layer;
    $(function(){
        login.init();
    })
})
var login = function(){
    var domon = function () {
        form.on('submit(formDemo)', function(data){
            var param = data.field;
            if (param.uid==""){
                layer.msg("请输入账号");
            }else if (param.password==""){
                layer.msg("请输入密码");
            }else{
                $.ajax({
                    url:"/judge",
                    type:"post",
                    dataType:"json",
                    data:param,
                    success:function (data) {
                        if (data.code==1){
                            location.href = "/"+data.url;
                        }else{
                            layer.msg(data.msg,{
                                time:3000,
                                end:function () {
                                    form.val("ftForm",{//表单赋值
                                        "uid":"",
                                        "password":""
                                    })
                                }
                            });
                        }
                    }
                })
            }

            return false; //阻止表单跳转。
        })
    }
    return{
        init:function () {
            domon();
        }
    }
}()