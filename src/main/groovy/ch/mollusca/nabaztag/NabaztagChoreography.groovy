package ch.mollusca.nabaztag

public class NabaztagChoreography{
	def led_colors = [
	red          : [255,   0,   0],
	orange       : [255, 127,   0],
	yellow       : [255, 255,   0],
	green        : [  0, 255,   0],
	blue         : [  0,   0, 255],
	purple       : [255,   0, 255],
	dim_red      : [127,   0,   0],
	dim_orange   : [127,  63,   0],
	dim_yellow   : [127, 127,   0],
	dim_green    : [  0, 127,   0],
	dim_blue     : [  0,   0, 127],
	dim_purple   : [127,   0, 127],
	off          : [  0,   0,   0]
	]
	
	def ears = [left : [1], right : [0], both : [0,1]]
	def leds = [bottom : 0, lefr : 1, middle : 2, right : 3, top : 4]
	def ear_directions = [forward : 0, backward : 1]
	
	
}
