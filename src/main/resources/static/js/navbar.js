$(function () {
    // solving active menu problem
    switch (menu) {
        case "All devices" :
            $("#allDevices").addClass("active");
            break;
        case "About Us" :
            $("#about").addClass("active");
            break;
        case "Contact Us" :
            $("#contact").addClass("active");
            break;
        default :
            $("#"+menu).addClass("active");
            break;
    }

});