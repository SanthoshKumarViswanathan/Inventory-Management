const checkLogin = () => {
    let username = $("#text-username").val();
    let password = $("#pass-password").val();

    console.log(username, password);
    

    $.ajax ({
        type:"GET",
        url: http+"/login?username="+username+"&password="+password,
        contentType: "application/json",

        success: function (data) {

           if(data) {
            toastr.success('Login Successful.', 'Done!', {timeOut: 3000});
            setTimeout(function() {
                window.location.href = 'dashboard';
            },1000);
           }
           else{
            toastr.error('Please check your credentials.', 'Login failed!', {timeOut: 5000});
           }
            

            // 
        } ,
        error: function (errorData) {
            alert("ERROR",errorData);
        }


    });
}