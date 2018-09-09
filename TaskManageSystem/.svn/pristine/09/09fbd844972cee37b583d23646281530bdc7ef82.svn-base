//模拟一段JSON数据，实际要从数据库中读取  
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
function showUpdateLayer(width, height) {
    var obj  = document.getElementById("updateteacher");
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