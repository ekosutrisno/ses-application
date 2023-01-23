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
                <link rel="preconnect" href="https://fonts.googleapis.com">
                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
                <title>Briix Financial Technology</title>
                <!--[if mso]><style type="text/css">body, table, td, a { font-family: 'Roboto', sans-serif !important; }</style><![endif]-->
            </head>
                        
            <body style="font-family: 'Roboto', sans-serif; margin: 0px; padding: 0px; background-color: #F6F7F9;">
            <table role="presentation" style="width: 100%; border-collapse: collapse; border: 0px; border-spacing: 0px; font-family: 'Roboto', sans-serif; background-color: rgb(239, 239, 239);">
                <tbody>
                <tr>
                    <td align="center" bgcolor="#F6F7F9" background="https://res.cloudinary.com/ekosutrisno/image/upload/v1674446498/briix/unnamed_nxkcx6.png" style="background-image:url('https://res.cloudinary.com/ekosutrisno/image/upload/v1674446498/briix/unnamed_nxkcx6.png');background-size:100% 100%;background-repeat:no-repeat;background-position:top center;padding:20px">
                        <table role="presentation" style="max-width: 600px; border-collapse: collapse; border: 0px; border-spacing: 0px; text-align: left;">
                            <tbody>
                            <tr>
                                <td style="background-color: #F6F7F9; border-radius: 10px; padding: 20px;">
                                    <div style="text-align: left;">
                                        <div style="padding-bottom: 25px;">
                                            <img src="https://res.cloudinary.com/ekosutrisno/image/upload/v1662784426/briix/Briix_fn6x8u.png" alt="Company Logo" style="width: 56px;">
                        
                                        </div>
                                    </div>
                                    <div>
                                        <div style="color: rgb(0, 0, 0); text-align: left;">
                                            <h1 style="margin: 1rem 0; font-size: 14px;">Hi there! We have news for you.</h1>
                                            <p style="padding-bottom: 8px; font-size: 14px; line-height: 120%;">DAMASUS has expressed interest in Property KU Rooms #9. Please review it at https://admin.briix.com.</p>
                                            <p style="padding-bottom: 8px; font-size: 12px;">Thanks,<br>The Briix team</p>
                                        </div>
                                    </div>
                                    <div style="padding-top: 5px; color: rgb(153, 153, 153); text-align: center;">
                                        <div style="text-align: left; margin-top: 20px; margin-bottom: 20px;">
                                            <img align="center" alt="kominfo_aftech_ojk_logo.png" class="zpImage" height="auto" hspace="0" size="S" src="https://res.cloudinary.com/ekosutrisno/image/upload/v1673936246/briix/OJK_gpedzb.png" style="width:150px;height:autopx;max-width:150px !important;border:0px;text-align:center;" vspace="0" width="150">
                                        </div>
                                        <div style="color: #999999;">
                                            <p style="font-family: 'Roboto', sans-serif; vertical-align: top; font-size: 12px; text-align: left; line-height: 125%;" valign="top" align="center">
                                                <span style="text-align: center;">This email has been sent by PT Briix Financial Technology.</span>
                                                <span style="text-align: center;">PT Briix Financial Technology is licensed  and monitored by Otoritas Jasa Keuangan (OJK).</span>
                                            </p>
                                            <p style="font-family: 'Roboto', sans-serif; vertical-align: top; font-size: 12px; text-align: left; line-height: 125%;" valign="top" align="center">
                                                <span style="font-weight: 600;">Risk Warning: </span>
                                                <span style="text-align: center;">Investments in property and unlisted shares carry a risk.  Your capital may be at risk  and you may not receive anticipated returns.</span>
                                            </p>
                                            <p style="font-family: 'Roboto', sans-serif; vertical-align: top; font-size: 12px; text-align: left; line-height: 125%;" valign="top" align="center">
                                                <span style="text-align: center;">You can reach out to us at support@briix.com if you have any questions and our team will take care of you!</span>
                                            </p>
                                        </div>
                        
                                        <div style="text-align: left; margin-top: 20px;">
                                            <p style="font-size: 12px; color: #999999;">Stay connected!</p>
                                            <div style="display: flex; align-items: center;">
                                                <a href="https://www.facebook.com/Briix.id" style="text-decoration: none; margin-right: 10px;" target="_blank">
                                                    <img alt="Facebook" height="35" src="https://zohopublic.com/zohocampaigns/1023745000000044336_1_1669906179456_zcsclwgtfb4.png" style="border: 0px; margin: 0px; outline: none; text-decoration: none; width: 24px; height: 24px;" vspace="10" width="35">
                                                </a>
                                                <a href="https://linkedin.com/company/briixproperties" style="text-decoration: none; margin-right: 10px;" target="_blank">
                                                    <img alt="LinkedIn" height="35" src="https://zohopublic.com/zohocampaigns/1023745000000044336_2_1669906179773_zcsclwgtlin4.png" style="border: 0px; margin: 0px; outline: none; text-decoration: none; width: 24px; height: 24px;" vspace="10" width="35">
                                                </a>
                                                <a href="https://instagram.com/briixproperties" style="text-decoration: none;" target="_blank">
                                                    <img alt="Instagram" height="35" src="https://zohopublic.com/zohocampaigns/1023745000000044336_3_1669906179817_zcsclwgtinsta4.png" style="border: 0px; margin: 0px; outline: none; text-decoration: none; width: 24px; height: 24px;" vspace="10" width="35">
                                                </a>
                                            </div>
                                        </div>
                                        <p class="content-block" style="font-family: 'Roboto', sans-serif; vertical-align: top; padding-bottom: 10px; color: #999999; font-size: 12px; text-align: left;" valign="top" align="center">
                                            <span class="apple-link" style="color: #999999; font-size: 12px; text-align: center;">PT Briix Financial Technology <br> Prosperity Tower 21st Floor, Unit I, District 8,<br> SCBD Lot 28, Jl. Jend. Sudirman Kav. 52 – 53, Jakarta 12190</span>
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
