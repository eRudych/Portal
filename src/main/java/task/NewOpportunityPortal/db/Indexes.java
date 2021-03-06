/*
 * This file is generated by jOOQ.
 */
package task.NewOpportunityPortal.db;


import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import task.NewOpportunityPortal.db.tables.Advert;
import task.NewOpportunityPortal.db.tables.Category;
import task.NewOpportunityPortal.db.tables.Chat;
import task.NewOpportunityPortal.db.tables.Comment;
import task.NewOpportunityPortal.db.tables.Message;
import task.NewOpportunityPortal.db.tables.Status;
import task.NewOpportunityPortal.db.tables.Tag;
import task.NewOpportunityPortal.db.tables.User;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ADVERT_PKEY = Indexes0.ADVERT_PKEY;
    public static final Index CATEGORY_NAME_KEY = Indexes0.CATEGORY_NAME_KEY;
    public static final Index CATEGORY_PKEY = Indexes0.CATEGORY_PKEY;
    public static final Index CHAT_PKEY = Indexes0.CHAT_PKEY;
    public static final Index COMMENT_PKEY = Indexes0.COMMENT_PKEY;
    public static final Index MESSAGE_PKEY = Indexes0.MESSAGE_PKEY;
    public static final Index STATUS_NAME_KEY = Indexes0.STATUS_NAME_KEY;
    public static final Index STATUS_PKEY = Indexes0.STATUS_PKEY;
    public static final Index TAG_NAME_KEY = Indexes0.TAG_NAME_KEY;
    public static final Index TAG_PKEY = Indexes0.TAG_PKEY;
    public static final Index USER_LOGIN_KEY = Indexes0.USER_LOGIN_KEY;
    public static final Index USER_NICK_KEY = Indexes0.USER_NICK_KEY;
    public static final Index USER_PKEY = Indexes0.USER_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ADVERT_PKEY = Internal.createIndex("advert_pkey", Advert.ADVERT, new OrderField[] { Advert.ADVERT.ID }, true);
        public static Index CATEGORY_NAME_KEY = Internal.createIndex("category_name_key", Category.CATEGORY, new OrderField[] { Category.CATEGORY.NAME }, true);
        public static Index CATEGORY_PKEY = Internal.createIndex("category_pkey", Category.CATEGORY, new OrderField[] { Category.CATEGORY.ID }, true);
        public static Index CHAT_PKEY = Internal.createIndex("chat_pkey", Chat.CHAT, new OrderField[] { Chat.CHAT.ID }, true);
        public static Index COMMENT_PKEY = Internal.createIndex("comment_pkey", Comment.COMMENT, new OrderField[] { Comment.COMMENT.ID }, true);
        public static Index MESSAGE_PKEY = Internal.createIndex("message_pkey", Message.MESSAGE, new OrderField[] { Message.MESSAGE.ID }, true);
        public static Index STATUS_NAME_KEY = Internal.createIndex("status_name_key", Status.STATUS, new OrderField[] { Status.STATUS.NAME }, true);
        public static Index STATUS_PKEY = Internal.createIndex("status_pkey", Status.STATUS, new OrderField[] { Status.STATUS.ID }, true);
        public static Index TAG_NAME_KEY = Internal.createIndex("tag_name_key", Tag.TAG, new OrderField[] { Tag.TAG.NAME }, true);
        public static Index TAG_PKEY = Internal.createIndex("tag_pkey", Tag.TAG, new OrderField[] { Tag.TAG.ID }, true);
        public static Index USER_LOGIN_KEY = Internal.createIndex("user_login_key", User.USER, new OrderField[] { User.USER.LOGIN }, true);
        public static Index USER_NICK_KEY = Internal.createIndex("user_nick_key", User.USER, new OrderField[] { User.USER.NICK }, true);
        public static Index USER_PKEY = Internal.createIndex("user_pkey", User.USER, new OrderField[] { User.USER.ID }, true);
    }
}
