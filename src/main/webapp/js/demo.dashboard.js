$(function () {
    var PageViews = [], Sales = [];
    for (var i = 0; i <= 31; i++) {
        PageViews.push([i, 100+ Math.floor((Math.random() < 0.5? -1 : 1) * Math.random() * 25)]);
        Sales.push([i, 60 + Math.floor((Math.random() < 0.5? -1 : 1) * Math.random() * 40)]);
    }

    var plot = $.plot($("#mws-dashboard-chart"),
           [ { data: PageViews, label: "Page Views", color: "#c75d7b"}, { data: Sales, label: "Sales", color: "#c5d52b" } ], {
               series: {
                   lines: { show: true },
                   points: { show: true }
               },
               grid: { hoverable: true, clickable: true },
               xaxis: { min: 1, max: 31 }, 
               yaxis: { min: 0, max: 200 }
             });
});
// add by hekexun
window.onload=indexinit();
//判定是否登录，如果登录了，显示用户名称
function indexinit() {
    var user ="hello,"+ $.cookie("userName");
    if (user == null) {
        alert("您还没有登录");
        window.location.href = "/login.html";
    } else {
        $('#mws-username').html('user')
    }
}