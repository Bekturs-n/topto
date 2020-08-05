class CategoryService{

    constructor(){
    }

    getAllAnouns(url) {
        let map = new Map();
        var json;
        $.ajax({
            type: "GET",
            url: url,
            xhrFields: {withCredentials: true},
            cache: false,
            async: false,
            // dataType: 'json',
            success: function (data) {
                // console.log(data);
                json = data;
                // alert(json[0].id);
                // console.log(data);
                // map =  data;
                // for (let field in data) {
                //     map.set("list", data.key);
                //     map.set("count", data.value);
                // }
            },
            error: function (xhr, status, error) {
                if (xhr.status === 404) {
                    alert('list User not found...');
                } else {
                    alert('Error - ' + xhr.status + ': ' + xhr.statusText + error);
                }
            }
        });
        // console.log(map);
        return json;
    }
}