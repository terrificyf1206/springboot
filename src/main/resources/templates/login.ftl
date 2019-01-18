<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<div>
    <span>hello! please login!</span>
</div>
<div>
    <span>用户名:</span><input type="text" id="userCode" />
    <span>密码:</span><input type="text" id="userPwd" />
</div>
<div>
    <input type="button" onclick="submitLogin()" value="登陆">
</div>
</body>

</html>
<script type="text/javascript" src="/js/md5.js"></script>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript">
    function submitLogin() {
        var userCode = $.trim($("#userCode").val());
        var userPwd = $.trim($("#userPwd").val());
        var hexPwd = hex_md5(userPwd);
        $.ajax({
            type: 'POST',
            url: "http://localhost:8888/auth/login_in",
            data: {"userCode":userCode,"userPwd":hexPwd},
            dataType:"json",
            success: function(rep){
                if(rep.status == 0){
                    alert(rep.message);
                    alert(rep.data);
                    //window.location.reload();
//                    loadPage(0,baseUrl);
                }else{
                    alert(rep.message);
                }
            },
            error:function(rep){
                alert("获取信息失败!");
            }
        });
    }
</script>