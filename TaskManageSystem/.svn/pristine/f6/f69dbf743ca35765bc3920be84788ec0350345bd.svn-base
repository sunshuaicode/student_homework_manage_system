//模拟一段JSON数据，实际要从数据库中读取  
var per = [  

            {homework_name:'高数作业',homework_teacher:'陈灿',homework_releasedate:'2018/6/11',homework_ringdate:'2018/6/12',homework:"查看作业",homework_state:'是'},  
            
            ];   
    
    
  window.onload = function(){  //窗口加载事件
      var student_list = document.getElementById('student_list');  
        
      for(var i = 0;i < per.length; i++){ //遍历一下json数据  
          var trow = getDataRow(per[i]); //定义一个方法,返回tr数据  
          student_list.appendChild(trow);  
       }  
      }  
        
  function getDataRow(h){  
     var row = document.createElement('tr'); //创建行
     row.align="center";       
     var nameCell = document.createElement('td'); //创建第一列 
     nameCell.innerHTML = h.homework_name; //填充数据  
     row.appendChild(nameCell); //加入行  ，下面类似  
       
     var teacherCell = document.createElement('td');//创建第二列  
     teacherCell.innerHTML = h.homework_teacher;  
     row.appendChild(teacherCell); 
     
       
     var releasedateCell=document.createElement('td')//创建第三列 
     releasedateCell.innerHTML=h.homework_releasedate;
     row.appendChild(releasedateCell);
     
     var ringdateCell = document.createElement('td');//创建第四列num  
     ringdateCell.innerHTML = h.homework_ringdate;  
     row.appendChild(ringdateCell);  
      var stateCell=document.createElement('td');//创建第五列
     stateCell.innerHTML=h.homework;
     row.appendChild(stateCell);
     
     var stateCell=document.createElement('td');//创建第五列
     stateCell.innerHTML=h.homework_state;
     row.appendChild(stateCell);
     
     
      return row; //返回tr数据      
     }  

