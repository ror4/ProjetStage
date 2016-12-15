$( document ).ready(function() {
    importJson();
});

function affichage(data){
    console.log(data);
    var nombre = 0;
    var choix = 0;
    $(data).each(function( index ) {
          nombre= index;
    });
    var string="<div class='knowledges'><br/>";
    for(var i=0; i<nombre+1; i++){
        string=string.concat(data[i].name+"<br/>");
    }
    string=string.concat("</div>");
    string=string.concat("<div class='level'><div class='colNiveau'>non connu</div><div class='colNiveau'>faible</div><div class='colNiveau'>intermédiaire</div><div class='colNiveau'>fort</div><br/>");
    for (var i=0; i<nombre+1; i++) {
        string=string.concat("<div onchange='importJson2()'><input style='margin-left: 36px;' name="+data[i].name+" type='radio' value='0' checked='checked'><input style='margin-left: 45px;' name="+data[i].name+" type='radio' value='1'><input style='margin-left: 54px;' name="+data[i].name+" type='radio' value='2'><input style='margin-left: 51px;' name="+data[i].name+" type='radio' value='3'></div>")
    $("input[name="+data[i].name+"][value='0']").prop("checked",true);
    }
    string=string.concat("</div>");
    $(".toggleKnowledges").html(string);
}

function importJson(){
    $.ajax({
       url : "/getAllKnowledgeJson",
       dataType : 'json',
       success : function(data, statut,sucess){
            affichage(data);
       },

       error : function(resultat, statut, erreur){
            alert(statut);
            console.log(erreur);
       }
    });
}

function importJson2(){

    $.ajax({
       url : "/getAllKnowledgeJson",
       dataType : 'json',
       success : function(data, statut,sucess){
            test(data);
       },

       error : function(resultat, statut, erreur){
            alert(statut);
            console.log(erreur);
       }
    });
}

function test(data){
    var nombre = 0;
    var choix=0;
    var string = "";
    $(data).each(function( index ) {
          nombre= index;
    });
    for(var i=0; i<nombre+1; i++){
        choix=$("input[name="+data[i].name+"]:checked").val();
        string=string.concat(data[i].id+","+choix+"-");
    }
    $("#truc").val(string);
}