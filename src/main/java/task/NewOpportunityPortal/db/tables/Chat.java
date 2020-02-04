/*
 * This file is generated by jOOQ.
 */
package task.NewOpportunityPortal.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import task.NewOpportunityPortal.db.Indexes;
import task.NewOpportunityPortal.db.Keys;
import task.NewOpportunityPortal.db.Public;
import task.NewOpportunityPortal.db.tables.records.ChatRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Chat extends TableImpl<ChatRecord> {

    private static final long serialVersionUID = 1242374714;

    /**
     * The reference instance of <code>public.chat</code>
     */
    public static final Chat CHAT = new Chat();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChatRecord> getRecordType() {
        return ChatRecord.class;
    }

    /**
     * The column <code>public.chat.id</code>.
     */
    public final TableField<ChatRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.chat.creatorId</code>.
     */
    public final TableField<ChatRecord, Long> CREATORID = createField(DSL.name("creatorId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.chat.advertId</code>.
     */
    public final TableField<ChatRecord, Long> ADVERTID = createField(DSL.name("advertId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.chat.name</code>.
     */
    public final TableField<ChatRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.chat.usersId</code>.
     */
    public final TableField<ChatRecord, Long[]> USERSID = createField(DSL.name("usersId"), org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>public.chat.created_at</code>.
     */
    public final TableField<ChatRecord, Timestamp> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.chat</code> table reference
     */
    public Chat() {
        this(DSL.name("chat"), null);
    }

    /**
     * Create an aliased <code>public.chat</code> table reference
     */
    public Chat(String alias) {
        this(DSL.name(alias), CHAT);
    }

    /**
     * Create an aliased <code>public.chat</code> table reference
     */
    public Chat(Name alias) {
        this(alias, CHAT);
    }

    private Chat(Name alias, Table<ChatRecord> aliased) {
        this(alias, aliased, null);
    }

    private Chat(Name alias, Table<ChatRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Chat(Table<O> child, ForeignKey<O, ChatRecord> key) {
        super(child, key, CHAT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CHAT_PKEY);
    }

    @Override
    public UniqueKey<ChatRecord> getPrimaryKey() {
        return Keys.CHAT_PKEY;
    }

    @Override
    public List<UniqueKey<ChatRecord>> getKeys() {
        return Arrays.<UniqueKey<ChatRecord>>asList(Keys.CHAT_PKEY, Keys.CHAT_CREATORID_KEY);
    }

    @Override
    public List<ForeignKey<ChatRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ChatRecord, ?>>asList(Keys.CHAT__FK_CHAT_USER, Keys.CHAT__FK_CHAT_ADVERT);
    }

    public User user() {
        return new User(this, Keys.CHAT__FK_CHAT_USER);
    }

    public Advert advert() {
        return new Advert(this, Keys.CHAT__FK_CHAT_ADVERT);
    }

    @Override
    public Chat as(String alias) {
        return new Chat(DSL.name(alias), this);
    }

    @Override
    public Chat as(Name alias) {
        return new Chat(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Chat rename(String name) {
        return new Chat(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Chat rename(Name name) {
        return new Chat(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, String, Long[], Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}