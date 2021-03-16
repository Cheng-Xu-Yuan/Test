var layer,table
layui.use(['layer','table'],function () {
    layer = layui.layer;
    table = layui.table;
    $(function () {
        role_manage.init();
    })
})
var role_manage = function () {
    var JianTing = function () {
        table.on('toolbar(fitTable)',function (obj) {
            //var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'add':
                    TanChuang();
                    break;
            };
        })
        table.on('tool(fitTable)',function (obj) {
            var data = obj.data; //获得当前行数据
            switch(obj.event){
                case 'del':
                    layer.msg('删除');
                    break;
                case 'update':
                    layer.msg('编辑');
                    break;
            };
        })
    }
    //弹窗
    var TanChuang = function () {
        layer.open({
            type: 1,
            area: ['420px', '240px'], //宽高
            content: $('#TanChu')
        });
    }
    //查询所有角色
    var FindAll = function () {
        table.render({
            elem: '#tableDemo',
            url: '/xtgl/findallrole', //数据接口
            method: 'post',
            toolbar: '#toolDomT',
            cols:[[
                {field: 'role_id',title:'ID',width:80,unresize: true},
                {field: 'role_name',title:'角色名称',width:200,unresize: true},
                {title: '操作',width:120,unresize: true,toolbar:'#toolDomL'}
            ]],
            response:{
                statusName: 'code', //规定数据状态的字段名称，默认：code
                statusCode: 0, //规定成功的状态码，默认：0
                msgName: 'msg' //规定状态信息的字段名称，默认：msg
                //countName: 'total', //规定数据总数的字段名称，默认：count
                //dataName: 'rows', //规定数据列表的字段名称，默认：data
            },
            parseData:function (res) {
                return {
                    "code": res.code, //解析接口状态
                    "msg": res.msg, //解析提示文本
                    //"count": res.total, //解析数据长度
                    "data": res.list //解析数据列表
                };
            }
        })
    }
    return{
        init:function () {
            FindAll();
            JianTing();
        }
    }
}()