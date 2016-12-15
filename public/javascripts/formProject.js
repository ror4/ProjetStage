/**
 * Created by Formation on 14/12/2016.
 */

// function toggle(projectType) {
//
//     var elem = document.getElementsByName(projectType);
//
//
//     if (elem.val() === 'CLIENT') {
//
//         document.getElementById(choixClient).style.display = 'block';
//
//     } else {
//
//         document.getElementById(choixClient).style.display = 'none';
//
//     }
//
// }

$(".toggleButtonFormProject").change(function(){
    $("#choixClient").toggle();
});

