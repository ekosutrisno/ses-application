package com.ekosutrisno.email.service;

/**
 * @author Eko Sutrisno
 * Senin, 05/12/2022 14.49
 */
public class TemplateEmail {
    public static String defaultEmail = "<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "    <meta charset=\"utf-8\">\n"
            + "    <title>Example HTML Email</title>\n"
            + "</head>\n"
            + "<body style=\"background: whitesmoke; padding: 30px; height: 100%\">\n"
            + "<h5 style=\"font-size: 18px; margin-bottom: 6px\">Hello All,</h5>\n"
            + "<p style=\"font-size: 16px; font-weight: 500\">This is a simple email using AWS SES</p>\n"
            + "<p><a target=\"_blank\" style=\"background-color: #199319; color: white;padding: 15px 25px; \" href=\"https://www.google.com/\">Google</a></p>"
            + "</body>\n"
            + "</html>";

    public static String otpEmail = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "  <title>Verify your login</title>\n" +
            "  <!--[if mso]><style type=\"text/css\">body, table, td, a { font-family: Arial, Helvetica, sans-serif !important; }</style><![endif]-->\n" +
            "</head>\n" +
            "<body style=\"font-family: Helvetica, Arial, sans-serif; margin: 0px; padding: 0px; background-color: #ffffff;\">\n" +
            "  <table role=\"presentation\"\n" +
            "    style=\"width: 100%; border-collapse: collapse; border: 0px; border-spacing: 0px; font-family: Arial, Helvetica, sans-serif; background-color: rgb(239, 239, 239);\">\n" +
            "    <tbody>\n" +
            "      <tr>\n" +
            "        <td align=\"center\" style=\"padding: 1rem 2rem; vertical-align: top; width: 100%;\">\n" +
            "          <table role=\"presentation\" style=\"max-width: 600px; border-collapse: collapse; border: 0px; border-spacing: 0px; text-align: left;\">\n" +
            "            <tbody>\n" +
            "              <tr>\n" +
            "                <td style=\"padding: 40px 0px 0px;\">\n" +
            "                  <div style=\"text-align: left;\">\n" +
            "                    <div style=\"padding-bottom: 20px;\"><img src=\"https://admin.test.briix.com/assets/briix-logo-1.91416f3d.png\" alt=\"Company\" style=\"width: 56px;\"></div>\n" +
            "                  </div>\n" +
            "                  <div style=\"padding: 20px; background-color: rgb(255, 255, 255);\">\n" +
            "                    <div style=\"color: rgb(0, 0, 0); text-align: left;\">\n" +
            "                      <h1 style=\"margin: 1rem 0\">Verification code</h1>\n" +
            "                      <p style=\"padding-bottom: 8px\">Hello <span style=\"font-weight: bold;\">{{firstName}}</span>, please use the verification code below to sign in.</p>\n" +
            "                      <p style=\"padding-bottom: 8px\"><strong style=\"font-size: 130%\">764909</strong></p>\n" +
            "                      <p style=\"padding-bottom: 8px\">If you didn’t request this, you can ignore this email.</p>\n" +
            "                      <p style=\"padding-bottom: 8px\">Thanks,<br>The Briix team</p>\n" +
            "                    </div>\n" +
            "                  </div>\n" +
            "                  <div style=\"padding-top: 10px; color: rgb(153, 153, 153); text-align: center;\">\n" +
            "                    <p>Made with ♥ by Briix</p>\n" +
            "                    <p class=\"content-block\" style=\"font-family: sans-serif; vertical-align: top; padding-bottom: 10px; color: #999999; font-size: 12px; text-align: center;\" valign=\"top\" align=\"center\">\n" +
            "                        <span class=\"apple-link\" style=\"color: #999999; font-size: 12px; text-align: center;\">PT Briix Financial Technology <br> Prosperity Tower 21st Floor, Unit I, District 8, SCBD Lot 28, <br> Jl. Jend. Sudirman Kav. 52 – 53, Jakarta 12190</span>\n" +
            "                        <br> Don't like these emails? <a href=\"http://i.imgur.com/CScmqnj.gif\" style=\"text-decoration: underline; color: #999999; font-size: 12px; text-align: center;\">Unsubscribe</a>.\n" +
            "                    </p>\n" +
            "                  </div>\n" +
            "                </td>\n" +
            "              </tr>\n" +
            "            </tbody>\n" +
            "          </table>\n" +
            "        </td>\n" +
            "      </tr>\n" +
            "    </tbody>\n" +
            "  </table>\n" +
            "</body>\n" +
            "</html>";
}
