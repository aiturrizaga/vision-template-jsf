/* global PF */
function handleSubmit(args, dialog) {
    var jqDialog = jQuery('#' + dialog);
    if (args.validationFailed) {
        jqDialog.effect('shake', { times: 3 }, 100);
    } else {
        PF(dialog).hide();
    }
}


/*progress*/
window.onload = function () {
    $('body').show();
    NProgress.start();
    setTimeout(function () {
        NProgress.done();
        $('.fade').removeClass('out');
    }, 500);
}
