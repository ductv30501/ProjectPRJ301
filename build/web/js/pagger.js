/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global google */

function pagger(id, pageindex, totalpage,gap)
{
    var container = document.getElementById(id);
    var result = '';
    //generate first
    if(pageindex - gap > 1)
        result +='<a href="product?page=1">First</a>';
    
    for(var i = pageindex - gap; i < pageindex ; i++)
    {
        if(i >=1)
        {
            result +='<a href="product?page='+i+'">'+i+'</a>';
        }
    }
    
    // generate span for pageindex
    result += '<span>'+pageindex+'</span>';
    
    for(var i = pageindex +1; i <= pageindex+gap ; i++)
    {
        if(i <= totalpage)
        {
            result +='<a href="product?page='+i+'">'+i+'</a>';
        }
    }
    
    //generate last
    if(pageindex + gap < totalpage)
        result +='<a href="product?page='+totalpage+'">Last</a>';
    
    container.innerHTML = result;
    }
  function xoa_dau(str) {
    str = str.replace(/à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ/g, "a");
    str = str.replace(/è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ/g, "e");
    str = str.replace(/ì|í|ị|ỉ|ĩ/g, "i");
    str = str.replace(/ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ/g, "o");
    str = str.replace(/ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ/g, "u");
    str = str.replace(/ỳ|ý|ỵ|ỷ|ỹ/g, "y");
    str = str.replace(/đ/g, "d");
    str = str.replace(/À|Á|Ạ|Ả|Ã|Â|Ầ|Ấ|Ậ|Ẩ|Ẫ|Ă|Ằ|Ắ|Ặ|Ẳ|Ẵ/g, "A");
    str = str.replace(/È|É|Ẹ|Ẻ|Ẽ|Ê|Ề|Ế|Ệ|Ể|Ễ/g, "E");
    str = str.replace(/Ì|Í|Ị|Ỉ|Ĩ/g, "I");
    str = str.replace(/Ò|Ó|Ọ|Ỏ|Õ|Ô|Ồ|Ố|Ộ|Ổ|Ỗ|Ơ|Ờ|Ớ|Ợ|Ở|Ỡ/g, "O");
    str = str.replace(/Ù|Ú|Ụ|Ủ|Ũ|Ư|Ừ|Ứ|Ự|Ử|Ữ/g, "U");
    str = str.replace(/Ỳ|Ý|Ỵ|Ỷ|Ỹ/g, "Y");
    str = str.replace(/Đ/g, "D");
    return str;
} 
function showmore(event)
{   var more = document.getElementById("more1");
    var hide = document.getElementById("hide1");
    var mytable = document.getElementById("table1");
    if (!mytable.style.display){
        mytable.style.display="none";
        more.style.display=null;
        hide.style.display="none";
    }else{
        mytable.style.display=null;
        more.style.display="none";
        hide.style.display=null;
    }
}
function showmore2(event)
{
    var more = document.getElementById("more2");
    var hide = document.getElementById("hide2");
    var mytable = document.getElementById("table2");
    if (!mytable.style.display){
        mytable.style.display="none";
        more.style.display=null;
        hide.style.display="none";
    }else{
        mytable.style.display=null;
        more.style.display="none";
        hide.style.display=null;
    }
}
function showmore3(event)
{
    var mytable = document.getElementById("table3");
    var more = document.getElementById("more3");
    var hide = document.getElementById("hide3");
    if (!mytable.style.display){
        mytable.style.display="none";
        more.style.display=null;
        hide.style.display="none";
    }else{
        mytable.style.display=null;
        more.style.display="none";
        hide.style.display=null;
    }
}
function showmore5()
{
    var more = document.getElementById("more5");
    var hide = document.getElementById("hide5");
    var mytable = document.getElementById("table5");
    if (!mytable.style.display){
        mytable.style.display="none";
        more.style.display=null;
        hide.style.display="none";
    }else{
        mytable.style.display=null;
        more.style.display="none";
        hide.style.display=null;
    }
}
function showmore4(event)
{
    var more = document.getElementById("more");
    var hide = document.getElementById("hide");
    var mytable = document.getElementById("table4");
    if (!mytable.style.display){
        mytable.style.display="none";
        more.style.display=null;
        hide.style.display="none";
    }else{
        mytable.style.display=null;
        more.style.display="none";
        hide.style.display=null;
    }
}


google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);
function drawChart(list) {
var data = google.visualization.arrayToDataTable([
        
  ['Loại sản phẩm', 'nghìn đồng'],
  ['Balo',84],
  ['Kéo',200],
  ['Gọt Bút Chì',240],
  ['Compa',345],
  ['Hồ Dán',420],
  ['Bút Lông',420],
  ['Thước Kẻ',440],
  ['Giấy A4',490],
  ['Bút Viết Bảng',570],
  ['Tẩy',570],
  ['Giấy Màu',595],
  ['Bảng',600],
  ['Đất Nặn',640],
  ['Bút viết dành cho học sinh lớp 1',650],
  ['Phấn',1000],
  ['Mực',1005],
  ['Vở Vẽ',1110],
  ['Giấy Kiểm Tra',1785],
  ['Ngòi Bút',1980],
  ['Bọc Vở',2200],
  ['Màu Vẽ',2357],
  ['Bút Bi',2550],
  ['Bút Chì',2920],
  ['Nước Uống',3540],
  ['Vở Viết',5250],
  ['Bút Máy',12440]
]);

var options = {
  title:'Tổng số tiền theo từng loại sản phẩm'
};

var chart = new google.visualization.BarChart(document.getElementById('myChart'));
  chart.draw(data, options);
}
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart2);

function drawChart2(dat) {
var data = google.visualization.arrayToDataTable([
  ['Loại sản phẩm', 'nghìn đồng'],
  ['Balo',84],
  ['Kéo',200],
  ['Gọt Bút Chì',240],
  ['Compa',345],
  ['Hồ Dán',420],
  ['Bút Lông',420],
  ['Thước Kẻ',440],
  ['Giấy A4',490],
  ['Bút Viết Bảng',570],
  ['Tẩy',570],
  ['Giấy Màu',595],
  ['Bảng',600],
  ['Đất Nặn',640],
  ['Bút viết dành cho học sinh lớp 1',650],
  ['Phấn',1000],
  ['Mực',1005],
  ['Vở Vẽ',1110],
  ['Giấy Kiểm Tra',1785],
  ['Ngòi Bút',1980],
  ['Bọc Vở',2200],
  ['Màu Vẽ',2357],
  ['Bút Bi',2550],
  ['Bút Chì',2920],
  ['Nước Uống',3540],
  ['Vở Viết',5250],
  ['Bút Máy',12440]
]);

var options = {
    title:'Tổng số tiền theo từng loại sản phẩm'
};

var chart = new google.visualization.PieChart(document.getElementById('myChart2'));
  chart.draw(data, options);
}
