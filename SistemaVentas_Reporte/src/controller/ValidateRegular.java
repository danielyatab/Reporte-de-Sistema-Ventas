/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.regex.Pattern;

/**
 *
 * @author yatac
 */
public class ValidateRegular {
    public static final Pattern SYMBOLS_PATTERN = Pattern.compile("^[a-zA-Z0-9]+$");
    public static boolean setCreateUser = false;
    public static int testValidate =0;
}
