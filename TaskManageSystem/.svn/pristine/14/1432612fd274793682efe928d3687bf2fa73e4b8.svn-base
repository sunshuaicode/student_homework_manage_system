//模拟一段JSON数据，实际要从数据库中读取  
  var per = [  
            {course_id:001,course_name:'张珊',course_teacher:123,course_classnum:123456},  
            {course_id:002,course_name:'李斯',course_teacher:123,course_classnum:123789},  
            {course_id:003,course_name:'王二',course_teacher:123,course_classnum:12354111},
            {course_id:004,course_name:'王武',course_teacher:123,course_classnum:123112},
            {course_id:005,course_name:'陈灿',course_teacher:123,course_classnum:123366},
            {course_id:006,course_name:'大屌',course_teacher:123,course_classnum:1236544},
            {course_id:007,course_name:'狗蛋',course_teacher:123,course_classnum:123645},
            {course_id:008,course_name:'嘴鸭',course_teacher:123,course_classnum:123654},
            {course_id:009,course_name:'靓女',course_teacher:123,course_classnum:1235454},
            {course_id:010,course_name:'帅哥',course_teacher:123,course_classnum:12365},
            {course_id:011,course_name:'丑比',course_teacher:123,course_classnum:12}
            ];   
    
  window.onload = function(){  //窗口加载事件
      var course_list = document.getElementById('course_list');  
        
      for(var i = 0;i < per.length; i++){ //遍历一下json数据  
          var trow = getDataRow(per[i]); //定义一个方法,返回tr数据  
          course_list.appendChild(trow);  
       }  
      }  
        
  function getDataRow(h){  
     var row = document.createElement('tr'); //创建行
     row.align="center";       
     var CidCell = document.createElement('td'); //创建第一列id  
     CidCell.innerHTML = h.course_id; //填充数据  
     row.appendChild(CidCell); //加入行  ，下面类似  
       
     var CnameCell = document.createElement('td');//创建第二列name  
     CnameCell.innerHTML = h.course_name;  
     row.appendChild(CnameCell); 
     CnameCell.style.width="300px"
       
     var CteacherCell=document.createElement('td')//创建第三列password  
     CteacherCell.innerHTML=h.course_teacher;
     row.appendChild(CteacherCell);
     
     var CnumCell = document.createElement('td');//创建第四列num  
     CnumCell.innerHTML = h.course_classnum;  
     row.appendChild(CnumCell);  
     
     //到这里，json中的数据已经添加到表格中，下面为每行末尾添加删除按钮  
       
     var delCell = document.createElement('td');//创建第列，操作列  
     row.appendChild(delCell);  
     var btnDel = document.createElement('input'); //创建一个input控件  
     btnDel.setAttribute('type','button'); //type="button"  
     btnDel.setAttribute('value','删除课程');  
     
     //javascript设置删除样式
     btnDel.onmouseover=function(){
     	btnDel.style.background="#003366"
     }
     btnDel.onmouseout=function(){
     	btnDel.style.background="#99CCCC"
     }
     btnDel.style.fontSize="18px";
     btnDel.style.fontWeight="20px";
     btnDel.style.outline="none";//定义轮廓
     btnDel.style.fontFamily="微软雅黑"; 
     btnDel.style.color="#ffffff";
     btnDel.style.background="#99CCCC";
     btnDel.style.border="0";
     btnDel.style.borderRadius="0.1em";
     btnDel.style.cursor="pointer";
     btnDel.style.opacity="1";
       
     //删除操作  
     btnDel.onclick=function(){  
         if(confirm("是否删除这一课程")){  
             //找到按钮所在行的节点，然后删掉这一行  
             this.parentNode.parentNode.parentNode.removeChild(this.parentNode.parentNode);  
             //btnDel - td - tr - tbody - 删除(tr)  
             //刷新网页还原。实际操作中，还要删除数据库中数据，实现真正删除  
             }  
         }  
     delCell.appendChild(btnDel);  //把删除按钮加入td，别忘了  
     
     var updateCell = document.createElement('td');//创建第列，操作列  
     row.appendChild(updateCell);  
     var btnUpdate = document.createElement('input'); //创建一个input控件  
     btnUpdate.setAttribute('type','button'); //type="button"  
     btnUpdate.setAttribute('value','修改信息');   
     
     //javascript设置修改样式
     btnUpdate.onmouseover=function(){
     	btnUpdate.style.background="#003366"
     }
     btnUpdate.onmouseout=function(){
     	btnUpdate.style.background="#99CCCC"
     }
     btnUpdate.style.fontSize="18px";
     btnUpdate.style.fontWeight="20px";
     btnUpdate.style.outline="none";//定义轮廓
     btnUpdate.style.fontFamily="微软雅黑"; 
     btnUpdate.style.color="#ffffff";
     btnUpdate.style.background="#99CCCC";
     btnUpdate.style.border="0";
     btnUpdate.style.borderRadius="0.1em";
     btnUpdate.style.cursor="pointer";
     btnUpdate.style.opacity="1";
     
     //修改操作
     btnUpdate.onclick=function(){  
          showLayer('updatelesson',600,450)
         }  
     updateCell.appendChild(btnUpdate);  //把删除按钮加入td，别忘了 
     
     return row; //返回tr数据      
     }  

function hideLayer(id) {
    var obj = document.getElementById(id);
    obj.style.display = "none";
    document.getElementById("mask").remove();
}

function showLayer(id, width, height) {
    var obj  = document.getElementById(id);
    var newMask = document.createElement("div");
    var winWidth = document.documentElement.clientWidth;
    var winHeight = document.documentElement.clientHeight;
    var offsetTop = document.documentElement.offsetTop;
    var left = (winWidth - width)/2;
    var top  = (winHeight - height)/2 + offsetTop;
    obj.style.top = top + "px";
    obj.style.left = left + "px";
    obj.style.display = "block";
  
        //mask div    
        newMask.id = "mask";
        newMask.style.position = "absolute";
        newMask.style.zIndex = "1";
        newMask.style.width = "100%";
        newMask.style.height = Math.max(document.body.scrollHeight,document.documentElement.scrollHeight) + 100 + "px";
        newMask.style.top = "0px";
        newMask.style.left = "0px";
        newMask.style.background = "blanchedalmond";
        newMask.style.opacity = "0.4";
        newMask.style.display = "block";
        document.body.appendChild(newMask);
    
}