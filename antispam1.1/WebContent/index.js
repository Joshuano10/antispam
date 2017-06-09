/**
 *
 * @index
 */

$(function(){
    $(".header").fadeIn("slow",function(){
        $(".link").fadeIn("slow",function(){
            $(".green").fadeIn("500", function() {
               $(".blue").fadeIn("500", function() {
                   $(".orange").fadeIn("500", function() {
                       $(".red").fadeIn("500");
                   });
               });
            });
        });
    });
})