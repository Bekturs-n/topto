function registration() {
    console.log("sadasd");
    // $("#submitReg").click(function (e) {
    //     e.preventDefault();
        console.log("sadasd");
        let name = $("#name").val();
        let pass = $("#password").val();
        let confirm_pass = $("#confirm_password").val();
        let email = $("#email").val();
        let tel = $("#tel").val();
        if(pass === confirm_pass) {
            $.post(
                "/api/user", {
                    name: name,
                    pass: pass,
                    email: email,
                    tel: tel
                },
                onAjaxSuccess
            );

            function onAjaxSuccess(data) {

            }
        } else {
            alert("Password are not identical");
        }
    // })
};