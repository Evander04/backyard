/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Evander R
 */
public class Hash {
      public Hash() {
    }
    
    public String Sha512(String text) throws NoSuchAlgorithmException {
        byte[] text2Bytes = text.getBytes();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text2Bytes);
        byte[] bytesResult = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytesResult.length; i++) {
            sb.append(Integer.toString((bytesResult[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();

    }
}
