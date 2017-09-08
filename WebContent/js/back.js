function move()
     {
         var s1=document.getElementById("s1");
         var s2=document.getElementById("s2");
         <!-- 获取一级和二级的属性-->
         var add;
         if(s1.value=="SC")
         {
             add=new Array("CD","DZ","MY","NC");
             <!--比对value值，实现对应二级text值的动态生成-->
         }else if(s1.value=="BJ")
         {
         add=new Array("HD","CY","WFJ");
<!--比对value值，实现对应二级text值的动态生成-->
         }else if(s1.value=="TJ")
         {
             add=new Array("TJG","TJ","TJY");
             <!--比对value值，实现对应二级text值的动态生成-->
           }else if(s1.value=="s1")
          {
              add=new Array("请选择");
            }
          else
          {
         add=null;
         <!--若没有就为空，当然不可能出现的-->
          }

          s2.length=0;
          for(var i=0;i<add.length;i++)
          {
              var ss=new Option();
              ss.text=add[i].split()[0];

              s2.add(ss);
              <!--把text值添加到二级select中，显示出来-->
          }

     }
function calc(){
	good = document.getElementById("good").value;
	ng=document.getElementById("ng").value;
	 sum= parseInt(good)+parseInt(ng);
	 document.getElementById("goodrate").value=good/sum;
	 document.getElementById("ngrate").value=ng/sum;
}
window.onload = calc;
function calc2(){
	plgood = document.getElementById("plgood").value;
	plng=document.getElementById("plng").value;
	 plsum= parseInt(good)+parseInt(ng);
	 document.getElementById("goodrate").value=plgood/plsum;
	 document.getElementById("ngrate").value=plng/plsum;
}
window.onload = calc2;