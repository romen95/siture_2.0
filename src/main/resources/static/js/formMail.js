$(document).ready(function() {
    $.get('/get_message', function(data) {
        console.log(data)
    })
});

function send_message() {
    $.ajax({
        url: '/add_message',
        dataType: "json",
        type: 'POST',
        cache: false,
        contentType: 'application/json',
        data: JSON.stringify({
            name: $("#name").val(),
            phone: $("#phone").val(),
            message: $("#message").val()
        }),
        success: function() {
            alert("Готово")
        }
    })
}












// $("#sendMail").on("click", function() {
//     var name = $("#name").val().trim();
//     var phone = $("#phone").val().trim();
//     var message = $("#message").val().trim();
//     var checkbox = $("#checkbox");
//
//     if (name == "") {
//         $("#errorMess").text("Введите имя*");
//         return false;
//     } else if (phone == "") {
//         $("#errorMess").text("Введите номер телефона*");
//         return false;
//     } else if (!(checkbox.is(':checked'))) {
//         $("#errorMess").text("Отметьте, что вы ознакомлены с политикой конфиденциальности*");
//         return false;
//     }
//
//     $("#errorMess").text("");

//     $.ajax({
//         url: '/',
//         type: 'POST',
//         cache: false,
//         data: { 'name': name, 'phone': phone },
//         dataType: 'html',
//         beforeSend: function() {
//           $("#sendMail").prop("disabled", true);
//         },
//         success: function(data) {
//             alert(data);
//             $("#sendMail").prop("disabled", false);
//         }
//     });
//
// });



// $(document).ready(function() {
//     $("#contactForm").submit(function(event) {
//         event.preventDefault(); // отменяем стандартное поведение формы
//
//         var name = $("#name").val();
//         var phone = $("#phone").val();
//
//         $.ajax({
//             type: "POST",
//             url: "/contact",
//             data: { name: name, phone: phone },
//             success: function(response) {
//                 if (response == "success") {
//                     alert("Сообщение отправлено");
//                 } else {
//                     alert("Ошибка отправки сообщения");
//                 }
//             },
//             error: function() {
//                 alert("Ошибка отправки сообщения");
//             }
//         });
//     });
// });

// $("#sendMail").on("click", function() {
//     var name = $("#name").val().trim();
//     var phone = $("#phone").val().trim();
//     var message = $("#message").val().trim();
//     var checkbox = $("#checkbox");
//
//     if (name == "") {
//         $("#errorMess").text("Введите имя");
//         return false;
//     } else if (phone == "") {
//         $("#errorMess").text("Введите номер телефона");
//         return false;
//     } else if (!(checkbox.is(':checked'))) {
//         $("#errorMess").text("Поставьте галочку");
//         return false;
//     }
//
//     $("#errorMess").text("");
//
//     $.ajax({
//         url: '/',
//         dataType: "json",
//         type: 'POST',
//         cache: false,
//         contentType: 'application/json',
//         data: JSON.stringify({
//             name: $("#name").val(),
//             phone: $("#phone").val()
//         }),
//         success: function() {
//             alert("Готово")
//         }
//     })
//
// });