/**
 * Ask user to confirm the action delete
 * @author rapha
 */

$(function () {

    $(".btn-remove-contact").on('click', function (e) {
        const id = $(this).attr('data-id');
        let answer = confirm("Do you really want to do this?");
        if (answer) {
            window.location.href = 'delete?id=' + id;
        }
    })
});