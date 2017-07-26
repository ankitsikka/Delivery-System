function  draw_circle(center_x, center_y){
var canvas = document.getElementById("canvas1");
canvas.style.backgroundColor = 'rgba(158, 167, 184, 0.2)';

var context = canvas.getContext("2d");
var centerX = center_x;
var centerY = center_y;
var radius = 70;
context.beginPath();
context.arc(centerX, centerY, radius, 0, 7, false);
context.fillStyle = 'green';
context.fill();
context.lineWidth = 5;
context.strokeStyle = '#003300';
context.stroke();
}
function  draw_line(center1_x, center1_y, center2_x, center2_y) {
var  canvas = document.getElementById("canvas1");
var context = canvas.getContext("2d");
context.beginPath();
context.moveTo(center1_x, center1_y);
context.lineTo(center2_x, center2_y);
context.stroke();
}
draw_circle(100,100);
draw_circle(300,200);
draw_line(100,100,300,200);