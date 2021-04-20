package com.snhu.sslserver;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class SslServerController {
	
	private static final Charset UTF_8 = StandardCharsets.UTF_8; //create UTF_8 charset to be used as input
	
	//create hash function with try catch blocks so that any algorithm errors are caught and dealt with
	//otherwise the application will not take direct constructor without try/catch
	public static byte[] digest(byte[] input, String algorithm) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
        byte[] result = md.digest(input);
        return result;
    }
	
	//create function to change byte value to hex value
	public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
	
    @RequestMapping("/hash")
    public String myHash(){
    	String data = "Vitalie Cucuta Project 2"; //custom data entry
        String algorithm = "SHA-256";	//algorithm type
        String format = "%-20s:%s";		//format for output
        
        //output the raw value of data string
        System.out.println(String.format(format, "data: ", data));
        
        //call hash function to encrypt data string 
        byte[] msgEncrypt = SslServerController.digest(data.getBytes(UTF_8), algorithm);
        
        //return hex value 
        return "<p>data: " + data + "\n\n<p>SHA-256 Algorithm : CheckSum Value:" + bytesToHex(msgEncrypt);
    }
}