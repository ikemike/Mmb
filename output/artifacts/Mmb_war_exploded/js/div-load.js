$(document).ready(function() {
    setInterval(function() {
        $("#loadable").load(location.href + " #loadable");

    }, 5000);

});

