package com.portal.z.common.domain.util;

import org.springframework.stereotype.Controller;

/**
 * 定数定義
 *
 */
@Controller
public final class Constants {

    private Constants() {
    }

    /**
     * ロール名<BR>
     * ・環境マスタ設定値。<BR>
     * ・一般用と管理者用を登録する。<BR>
     * ・Spring Securityの認可処理は、"ROLE_"で始まる権限情報をロールとして扱うので、<BR>
     * かならず"ROLE_"をつけること。
     */
    public static enum ROLE_NAME {
        /**
         * 一般用ロール(ROLE_GENERAL)
         */
        ROLE_NAME_G,
        /**
         * 管理者用ロール(ROLE_ADMIN)
         */
        ROLE_NAME_A
    };

    /**
     * ログイン失敗回数の最大値（１回）<BR>
     * ・環境マスタ設定値。<BR>
     * ・この値を超えるとアカウントがロックされます。
     */
    public static final String LOGIN_MISS_TIMES_MAX = "1";

    /**
     * パスワード有効期間（１か月）<BR>
     * ・環境マスタ設定値。<BR>
     * ・パスワードの有効期限の初期値（月数）
     */
    public static final int PASS_UPDATE_NXT = 1;

    /**
     * メール送信可否フラグ<BR>
     * ・環境マスタ設定値。
     *
     */
    public static enum SEND_MAIL {
        /**
         * メール送信可
         */
        SEND_MAIL_ENABLE,
        /**
         * メール送信不可
         */
        SEND_MAIL_DISABLE
    };

    /**
     * メール送信用SMTPの設定<BR>
     * ・環境マスタ設定値。
     *
     */
    public static enum MAIL_SMTP {
        /**
         * SMTPホストアドレス
         */
        MAIL_SMTP_HOST,
        /**
         * SMTPホストポート番号
         */
        MAIL_SMTP_PORT,
        /**
         * SMTPログインユーザ名
         */
        MAIL_SMTP_USERNAME,
        /**
         * SMTPログインユーザパスワード
         */
        MAIL_SMTP_PASSWORD,
        /**
         * SMTP認証
         */
        MAIL_SMTP_AUTH,
        /**
         * TLS接続 TLSによる接続が必要かどうか 必要な場合はTRUEをセットする
         */
        MAIL_SMTP_STARTTLS_ENABLE
    }


}
