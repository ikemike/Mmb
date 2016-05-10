$(document).ready(function() {
    setInterval(function() {
        $("#loadable").load(location.href + " #loadable");
        $.ajax({
           type:"GET",
            url:"/restricted/viewBrain"

        });
    }, 500);

});

