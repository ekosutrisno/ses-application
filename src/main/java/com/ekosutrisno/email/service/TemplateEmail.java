package com.ekosutrisno.email.service;

import java.util.Random;

/**
 * @author Eko Sutrisno
 * Senin, 05/12/2022 14.49
 */
public class TemplateEmail {
    public static String defaultEmail = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="utf-8">
                <title>Example HTML Email</title>
            </head>
            <body style="background: whitesmoke; padding: 30px; height: 100%">
            <h5 style="font-size: 18px; margin-bottom: 6px">Hello All,</h5>
            <p style="font-size: 16px; font-weight: 500">This is a simple email using AWS SES</p>
            <p><a target="_blank" style="background-color: #199319; color: white;padding: 15px 25px; " href="https://www.google.com/">Google</a></p></body>
            </html>""";

    public static String otpEmail = """
            <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
            <html xmlns="http://www.w3.org/1999/xhtml">
            <head>
              <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
              <meta name="viewport" content="width=device-width, initial-scale=1.0">
              <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
              <title>Verify your login</title>
              <!--[if mso]><style type="text/css">body, table, td, a { font-family: 'Roboto', sans-serif !important; }</style><![endif]-->
            </head>
            <body style="font-family: 'Roboto', sans-serif; margin: 0px; padding: 0px; background-color: #ffffff;">
              <table role="presentation"
                style="width: 100%; border-collapse: collapse; border: 0px; border-spacing: 0px; font-family: 'Roboto', sans-serif; background-color: rgb(239, 239, 239);">
                <tbody>
                  <tr>
                    <td align="center" style="padding: 1rem 2rem; vertical-align: top; width: 100%;">
                      <table role="presentation" style="max-width: 600px; border-collapse: collapse; border: 0px; border-spacing: 0px; text-align: left;">
                        <tbody>
                          <tr>
                            <td style="padding: 40px 0px 0px;">
                              <div style="text-align: left;">
                                <div style="padding-bottom: 20px;"><img src="https://admin.test.briix.com/assets/briix-logo-1.91416f3d.png" alt="Company" style="width: 56px;"></div>
                              </div>
                              <div style="padding: 20px; background-color: rgb(255, 255, 255);">
                                <div style="color: rgb(0, 0, 0); text-align: left;">
                                  <h1 style="margin: 1rem 0">Verification code</h1>
                                  <p style="padding-bottom: 8px">Hello <span style="font-weight: bold;">{{name}}</span>, please use the verification code below to sign in.</p>
                                  <p style="padding-bottom: 8px"><strong style="font-size: 130%">{{pin}}</strong></p>
                                  <p style="padding-bottom: 8px">If you didn’t request this, you can ignore this email.</p>
                                  <p style="padding-bottom: 8px">Thanks,<br>The Briix team</p>
                                </div>
                              </div>
                              <div style="padding-top: 10px; color: rgb(153, 153, 153); text-align: center;">
                                <p>Made with ♥ by Briix</p>
                                <p class="content-block" style="font-family: 'Roboto', sans-serif; vertical-align: top; padding-bottom: 10px; color: #999999; font-size: 12px; text-align: center;" valign="top" align="center">
                                    <span class="apple-link" style="color: #999999; font-size: 12px; text-align: center;">PT Briix Financial Technology <br> Prosperity Tower 21st Floor, Unit I, District 8, SCBD Lot 28, <br> Jl. Jend. Sudirman Kav. 52 – 53, Jakarta 12190</span>
                                    <br> Don't like these emails? <a href="http://i.imgur.com/CScmqnj.gif" style="text-decoration: underline; color: #999999; font-size: 12px; text-align: center;">Unsubscribe</a>.
                                </p>
                              </div>
                            </td>
                          </tr>
                        </tbody>
                      </table>
                    </td>
                  </tr>
                </tbody>
              </table>
            </body>
            </html>""";

    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
}
