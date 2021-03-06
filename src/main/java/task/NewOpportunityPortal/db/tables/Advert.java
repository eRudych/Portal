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
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import task.NewOpportunityPortal.db.Indexes;
import task.NewOpportunityPortal.db.Keys;
import task.NewOpportunityPortal.db.Public;
import task.NewOpportunityPortal.db.tables.records.AdvertRecord;


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
public class Advert extends TableImpl<AdvertRecord> {

    private static final long serialVersionUID = -495502917;

    /**
     * The reference instance of <code>public.advert</code>
     */
    public static final Advert ADVERT = new Advert();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdvertRecord> getRecordType() {
        return AdvertRecord.class;
    }

    /**
     * The column <code>public.advert.id</code>.
     */
    public final TableField<AdvertRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.advert.creatorId</code>.
     */
    public final TableField<AdvertRecord, Long> CREATORID = createField(DSL.name("creatorId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.advert.categoryId</code>.
     */
    public final TableField<AdvertRecord, Long> CATEGORYID = createField(DSL.name("categoryId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.advert.workersId</code>.
     */
    public final TableField<AdvertRecord, Long[]> WORKERSID = createField(DSL.name("workersId"), org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>public.advert.subject</code>.
     */
    public final TableField<AdvertRecord, String> SUBJECT = createField(DSL.name("subject"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.advert.info</code>.
     */
    public final TableField<AdvertRecord, String> INFO = createField(DSL.name("info"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.advert.linkToDoc</code>.
     */
    public final TableField<AdvertRecord, String> LINKTODOC = createField(DSL.name("linkToDoc"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.advert.statusId</code>.
     */
    public final TableField<AdvertRecord, Long> STATUSID = createField(DSL.name("statusId"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.advert.tagsId</code>.
     */
    public final TableField<AdvertRecord, Long[]> TAGSID = createField(DSL.name("tagsId"), org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>public.advert.amountOfMarks</code>.
     */
    public final TableField<AdvertRecord, Long[]> AMOUNTOFMARKS = createField(DSL.name("amountOfMarks"), org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>public.advert.averageMark</code>.
     */
    public final TableField<AdvertRecord, Long> AVERAGEMARK = createField(DSL.name("averageMark"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.advert.created_at</code>.
     */
    public final TableField<AdvertRecord, Timestamp> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.advert</code> table reference
     */
    public Advert() {
        this(DSL.name("advert"), null);
    }

    /**
     * Create an aliased <code>public.advert</code> table reference
     */
    public Advert(String alias) {
        this(DSL.name(alias), ADVERT);
    }

    /**
     * Create an aliased <code>public.advert</code> table reference
     */
    public Advert(Name alias) {
        this(alias, ADVERT);
    }

    private Advert(Name alias, Table<AdvertRecord> aliased) {
        this(alias, aliased, null);
    }

    private Advert(Name alias, Table<AdvertRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Advert(Table<O> child, ForeignKey<O, AdvertRecord> key) {
        super(child, key, ADVERT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ADVERT_PKEY);
    }

    @Override
    public UniqueKey<AdvertRecord> getPrimaryKey() {
        return Keys.ADVERT_PKEY;
    }

    @Override
    public List<UniqueKey<AdvertRecord>> getKeys() {
        return Arrays.<UniqueKey<AdvertRecord>>asList(Keys.ADVERT_PKEY, Keys.ADVERT_CREATORID_KEY, Keys.ADVERT_STATUSID_KEY);
    }

    @Override
    public List<ForeignKey<AdvertRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AdvertRecord, ?>>asList(Keys.ADVERT__FK_ADVERT_USER, Keys.ADVERT__FK_ADVERT_CATEGORY, Keys.ADVERT__FK_ADVERT_STATUS);
    }

    public User user() {
        return new User(this, Keys.ADVERT__FK_ADVERT_USER);
    }

    public Category category() {
        return new Category(this, Keys.ADVERT__FK_ADVERT_CATEGORY);
    }

    public Status status() {
        return new Status(this, Keys.ADVERT__FK_ADVERT_STATUS);
    }

    @Override
    public Advert as(String alias) {
        return new Advert(DSL.name(alias), this);
    }

    @Override
    public Advert as(Name alias) {
        return new Advert(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Advert rename(String name) {
        return new Advert(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Advert rename(Name name) {
        return new Advert(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, Long[], String, String, String, Long, Long[], Long[], Long, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
