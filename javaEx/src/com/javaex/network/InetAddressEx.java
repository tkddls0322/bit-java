package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//	인터넷 주소에 관련된 InetAddress 클래스 이해
/*
 * 이더넷 어댑터 이더넷:
 * 연결별 DNS 접미사. . . . : kornet
 * 링크-로컬 IPv6 주소 . . . . : fe80::480c:f12:22e4:24a8%5
 * IPv4 주소 . . . . . . . . . : 121.138.83.42  <- 로컬주소
 * 서브넷 마스크 . . . . . . . : 255.255.255.128
 * 기본 게이트웨이 . . . . . . : 121.138.83.126
 */
public class InetAddressEx {
	
	public static void main(String[] args) {
		// 원격 서버의 IP 주소 확인
		printServerIp("www.google.com");
		printServerIp("www.naver.com");
		printServerIp("www.youtube.com");
		
	}
	
	
	private static void printServerIp(String hostname) {
		try {
			//	Local IP 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP:"+local.getHostAddress());
			
			// hostname 주소의 실제 IP를 확인
			InetAddress[] addrs = InetAddress.getAllByName(hostname);
			for (InetAddress remote: addrs) {
				System.out.println(hostname + " : " + remote.getHostAddress());
			}
			
			
		} catch (UnknownHostException e){
			e.printStackTrace();
		}
	}
	
	
}