let map;
jQuery(document).ready(function ($) {
    let catSer = new CategoryService();

    map = catSer.getAllAnouns("/api/category");
    var category;
    var bool1 = true;
    // for (let i = 0; i < map.get("list").length; i++){
    //
    // // }
    //     alert(map[0].id);
    for (key in map) {
        if (map.hasOwnProperty(key) && map[key].parentsId === 0) {
            if (bool1) {
                category += "<option disabled selected> Выберите категорию </option>";
                category += "<option value='" + map[key].id + "' >" + map[key].category + "</option>";
                bool1 = false;
            } else {
                category += "<option value='" + map[key].id + "' >" + map[key].category + "</option>";
            }
            // console.log("Ключ = " + key);
            // console.log("Значение = " + map[key].id + ' ' + map[key].category + ' ' + map[key].parentsId);
        }
    }
    // category += "</select>"
    $("#category").append(category);

    $("#category").change(function () {
        var id = $("#category").val();
        var subcategory;
        var bool2 = true;

        for (key1 in map) {
            if (map.hasOwnProperty(key1) && map[key1].parentsId == id) {
                if (bool2) {
                    subcategory += "<option disabled selected> Выберите категорию </option>";
                    subcategory += "<option value='"+map[key1].id+"'>" + map[key1].category + "</option>";
                    bool2 = false;
                } else {
                    subcategory += "<option value='"+map[key1].id+"'>" + map[key1].category + "</option>";
                }
                // console.log("Ключ = " + key1);
                // console.log("Значение = " + map[key1].id + ' ' + map[key1].category + ' ' + map[key1].parentsId);
            }
        }
        $("#subcategory").html(subcategory);
    })

    jQuery("#submitReg").click(function () {
        console.log("sadasd");
        let name = document.getElementById("#name").value;
        let pass = document.getElementById("#password").value;
        let confirm_pass = document.getElementById("#confirm_password").value;
        let email = document.getElementById("#email").value;
        let tel = document.getElementById("#tel").value;
        // if(pass === confirm_pass) {
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
        // } else {
        //     alert("Password are not identical");
        // }
    })

    jQuery("#submit1").click(function (e) {
            e.preventDefault();
            selector = document.getElementById("subcategory");
            let subcategory = selector[selector.selectedIndex].value;

            let title = document.getElementById("title").value;
            let description = document.getElementById("description").value;
            let uploadfile = $("#addAdvertFile").val();
            let anounsment = {
                "title": title,
                "description": description,
                "categoryId": subcategory,
                "userId": 1
            }
            console.log(anounsment);
        $.post(
            "/api/anouns", {
                category: subcategory,
                title: title,
                description: description,
                userId: 1,
                uploadfile: uploadfile
            },
            onAjaxSuccess
        );
        function onAjaxSuccess(data) {

        }

        // $.ajax({
        //     type: "GET",
        //     url: "/api/anouns",
        //     data: anounsment,
        //     xhrFields: {withCredentials: true},
        //     cache: false,
        //     async: false,
        //     contentType: "application / json, charset=utf-8",
        //     // dataType: 'json',
        //     success: function (data) {
        //     },
        // });
    });
});

// $.post(
//     "/api/anouns", {
//         anouns: anounsment
//     },
//     onAjaxSuccess
// );
//
// function onAjaxSuccess(data) {
//     if (data == "error") {
//         $("#errorM").css('display', 'block');
//     } else {
//         updatePage();
//         $("#myModal").closest('.modal').modal('hide');
//     }
// }
// $.post(
//     "/update", {
//         id: id,
//         username: username,
//         password: password,
//         role: role
//     },
//     onAjaxSuccess
// );


// function subcategory(id) {
//     var subcategory;
//     var bool2 = true;
//     for (key in map) {
//         if (map.hasOwnProperty(key) && map[key].parentsId === id) {
//             if (bool2) {
//                 subcategory += "<option disabled selected>" + map[key].category + "</option>";
//                 bool2 = false;
//             }
//             subcategory += "<option>" + map[key].category + "</option>";
//             console.log("Ключ = " + key);
//             console.log("Значение = " + map[key].id + ' ' + map[key].category + ' ' + map[key].parentsId);
//         }
//     }
//     $("#subcategory").append(subcategory);
// }




