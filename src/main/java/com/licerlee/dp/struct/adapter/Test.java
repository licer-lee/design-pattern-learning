package com.licerlee.dp.struct.adapter;

// 相对于client端，表面只能看到AudioPlayer，
// 但其背后适配了视频接口的，故表现出全能播放器的特性
public class Test {

	public static void main(String[] args) {
		
		
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
