$("#sendMail").on("click", function() {
    var name = $("#name").val().trim();
    var phone = $("#phone").val().trim();
    var message = $("#message").val().trim();
    var checkbox = $("#checkbox");

    if (name == "") {
        $("#errorMess").text("Введите имя");
        return false;
    } else if (phone == "") {
        $("#errorMess").text("Введите номер телефона");
        return false;
    } else if (!(checkbox.is(':checked'))) {
        $("#errorMess").text("Поставьте галочку");
        return false;
    }

    $("#errorMess").text("");

    $.ajax({
        url: 'mail.php',
        type: 'POST',
        cache: false,
        data: { 'name': name, 'phone': phone },
        dataType: 'html',
        beforeSend: function() {
          $("#sendMail").prop("disabled", true);
        },
        success: function(data) {
            alert(data);
            $("#sendMail").prop("disabled", false);
        }
    });

});