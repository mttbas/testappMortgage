$( document ).ready(function() {
    $('#serverAnswer').text("You have not yet clicked the button");
});

function askServer() {
    $.ajax({
        type: "GET",
        url: "server/basicinfo",
        contentType: "application/json",
        success: function (data, status, jqXHR) {
            $('#serverAnswer').text("server:"+data.myHostName+" time:"+data.myTime);
        },
        error: function (jqXHR, status) {
            console.log('error asking server');
        }

     });


}