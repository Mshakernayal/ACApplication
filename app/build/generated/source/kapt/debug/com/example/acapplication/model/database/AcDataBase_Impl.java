package com.example.acapplication.model.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.acapplication.model.dao.ClientDao;
import com.example.acapplication.model.dao.ClientDao_Impl;
import com.example.acapplication.model.dao.DailyDetailsDao;
import com.example.acapplication.model.dao.DailyDetailsDao_Impl;
import com.example.acapplication.model.dao.InvoiceDao;
import com.example.acapplication.model.dao.InvoiceDao_Impl;
import com.example.acapplication.model.dao.PaymentDao;
import com.example.acapplication.model.dao.PaymentDao_Impl;
import com.example.acapplication.model.dao.SpendDao;
import com.example.acapplication.model.dao.SpendDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AcDataBase_Impl extends AcDataBase {
  private volatile ClientDao _clientDao;

  private volatile DailyDetailsDao _dailyDetailsDao;

  private volatile InvoiceDao _invoiceDao;

  private volatile PaymentDao _paymentDao;

  private volatile SpendDao _spendDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `client` (`image` BLOB NOT NULL, `name` TEXT NOT NULL, `address` TEXT NOT NULL, `phone` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dailyDetails` (`image` TEXT, `name` TEXT NOT NULL, `totalMoney` INTEGER NOT NULL, `barcodeNo` TEXT NOT NULL, `state` TEXT NOT NULL, `numberState` INTEGER NOT NULL, `clientId` INTEGER, `id` INTEGER PRIMARY KEY AUTOINCREMENT, FOREIGN KEY(`clientId`) REFERENCES `client`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `invoice` (`name` TEXT NOT NULL, `itemType` TEXT NOT NULL, `number` INTEGER NOT NULL, `meter` INTEGER NOT NULL, `price` INTEGER NOT NULL, `spend` INTEGER, `notice` TEXT NOT NULL, `invoiceState` INTEGER NOT NULL, `dailyDetailsId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT, FOREIGN KEY(`dailyDetailsId`) REFERENCES `dailyDetails`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `payment` (`name` TEXT NOT NULL, `totalMoney` INTEGER NOT NULL, `notice` TEXT NOT NULL, `dailyDetailsId` INTEGER NOT NULL, `PaymentState` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT, FOREIGN KEY(`dailyDetailsId`) REFERENCES `dailyDetails`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `spend` (`details` TEXT NOT NULL, `totalMoney` INTEGER NOT NULL, `notice` TEXT NOT NULL, `dailyDetailsId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT, FOREIGN KEY(`dailyDetailsId`) REFERENCES `dailyDetails`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4b2640c8ade8aa80526bba4915408080')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `client`");
        _db.execSQL("DROP TABLE IF EXISTS `dailyDetails`");
        _db.execSQL("DROP TABLE IF EXISTS `invoice`");
        _db.execSQL("DROP TABLE IF EXISTS `payment`");
        _db.execSQL("DROP TABLE IF EXISTS `spend`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsClient = new HashMap<String, TableInfo.Column>(5);
        _columnsClient.put("image", new TableInfo.Column("image", "BLOB", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClient.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysClient = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesClient = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoClient = new TableInfo("client", _columnsClient, _foreignKeysClient, _indicesClient);
        final TableInfo _existingClient = TableInfo.read(_db, "client");
        if (! _infoClient.equals(_existingClient)) {
          return new RoomOpenHelper.ValidationResult(false, "client(com.example.acapplication.model.entity.ClientEntity).\n"
                  + " Expected:\n" + _infoClient + "\n"
                  + " Found:\n" + _existingClient);
        }
        final HashMap<String, TableInfo.Column> _columnsDailyDetails = new HashMap<String, TableInfo.Column>(8);
        _columnsDailyDetails.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyDetails.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyDetails.put("totalMoney", new TableInfo.Column("totalMoney", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyDetails.put("barcodeNo", new TableInfo.Column("barcodeNo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyDetails.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyDetails.put("numberState", new TableInfo.Column("numberState", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyDetails.put("clientId", new TableInfo.Column("clientId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDailyDetails.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDailyDetails = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysDailyDetails.add(new TableInfo.ForeignKey("client", "CASCADE", "NO ACTION",Arrays.asList("clientId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesDailyDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDailyDetails = new TableInfo("dailyDetails", _columnsDailyDetails, _foreignKeysDailyDetails, _indicesDailyDetails);
        final TableInfo _existingDailyDetails = TableInfo.read(_db, "dailyDetails");
        if (! _infoDailyDetails.equals(_existingDailyDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "dailyDetails(com.example.acapplication.model.entity.DailyDetailsEntity).\n"
                  + " Expected:\n" + _infoDailyDetails + "\n"
                  + " Found:\n" + _existingDailyDetails);
        }
        final HashMap<String, TableInfo.Column> _columnsInvoice = new HashMap<String, TableInfo.Column>(10);
        _columnsInvoice.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("itemType", new TableInfo.Column("itemType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("number", new TableInfo.Column("number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("meter", new TableInfo.Column("meter", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("spend", new TableInfo.Column("spend", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("notice", new TableInfo.Column("notice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("invoiceState", new TableInfo.Column("invoiceState", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("dailyDetailsId", new TableInfo.Column("dailyDetailsId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvoice.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInvoice = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysInvoice.add(new TableInfo.ForeignKey("dailyDetails", "CASCADE", "NO ACTION",Arrays.asList("dailyDetailsId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesInvoice = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoInvoice = new TableInfo("invoice", _columnsInvoice, _foreignKeysInvoice, _indicesInvoice);
        final TableInfo _existingInvoice = TableInfo.read(_db, "invoice");
        if (! _infoInvoice.equals(_existingInvoice)) {
          return new RoomOpenHelper.ValidationResult(false, "invoice(com.example.acapplication.model.entity.InvoiceEntity).\n"
                  + " Expected:\n" + _infoInvoice + "\n"
                  + " Found:\n" + _existingInvoice);
        }
        final HashMap<String, TableInfo.Column> _columnsPayment = new HashMap<String, TableInfo.Column>(6);
        _columnsPayment.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPayment.put("totalMoney", new TableInfo.Column("totalMoney", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPayment.put("notice", new TableInfo.Column("notice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPayment.put("dailyDetailsId", new TableInfo.Column("dailyDetailsId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPayment.put("PaymentState", new TableInfo.Column("PaymentState", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPayment.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPayment = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysPayment.add(new TableInfo.ForeignKey("dailyDetails", "CASCADE", "NO ACTION",Arrays.asList("dailyDetailsId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesPayment = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPayment = new TableInfo("payment", _columnsPayment, _foreignKeysPayment, _indicesPayment);
        final TableInfo _existingPayment = TableInfo.read(_db, "payment");
        if (! _infoPayment.equals(_existingPayment)) {
          return new RoomOpenHelper.ValidationResult(false, "payment(com.example.acapplication.model.entity.PaymentEntity).\n"
                  + " Expected:\n" + _infoPayment + "\n"
                  + " Found:\n" + _existingPayment);
        }
        final HashMap<String, TableInfo.Column> _columnsSpend = new HashMap<String, TableInfo.Column>(5);
        _columnsSpend.put("details", new TableInfo.Column("details", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSpend.put("totalMoney", new TableInfo.Column("totalMoney", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSpend.put("notice", new TableInfo.Column("notice", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSpend.put("dailyDetailsId", new TableInfo.Column("dailyDetailsId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSpend.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSpend = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysSpend.add(new TableInfo.ForeignKey("dailyDetails", "CASCADE", "NO ACTION",Arrays.asList("dailyDetailsId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesSpend = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSpend = new TableInfo("spend", _columnsSpend, _foreignKeysSpend, _indicesSpend);
        final TableInfo _existingSpend = TableInfo.read(_db, "spend");
        if (! _infoSpend.equals(_existingSpend)) {
          return new RoomOpenHelper.ValidationResult(false, "spend(com.example.acapplication.model.entity.SpendEntity).\n"
                  + " Expected:\n" + _infoSpend + "\n"
                  + " Found:\n" + _existingSpend);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4b2640c8ade8aa80526bba4915408080", "29ba3ee3f7e45f7d20d22689c6266694");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "client","dailyDetails","invoice","payment","spend");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `client`");
      _db.execSQL("DELETE FROM `dailyDetails`");
      _db.execSQL("DELETE FROM `invoice`");
      _db.execSQL("DELETE FROM `payment`");
      _db.execSQL("DELETE FROM `spend`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ClientDao.class, ClientDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DailyDetailsDao.class, DailyDetailsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(InvoiceDao.class, InvoiceDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PaymentDao.class, PaymentDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SpendDao.class, SpendDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ClientDao getClientDao() {
    if (_clientDao != null) {
      return _clientDao;
    } else {
      synchronized(this) {
        if(_clientDao == null) {
          _clientDao = new ClientDao_Impl(this);
        }
        return _clientDao;
      }
    }
  }

  @Override
  public DailyDetailsDao getDailyDetailsDao() {
    if (_dailyDetailsDao != null) {
      return _dailyDetailsDao;
    } else {
      synchronized(this) {
        if(_dailyDetailsDao == null) {
          _dailyDetailsDao = new DailyDetailsDao_Impl(this);
        }
        return _dailyDetailsDao;
      }
    }
  }

  @Override
  public InvoiceDao getInvoiceDao() {
    if (_invoiceDao != null) {
      return _invoiceDao;
    } else {
      synchronized(this) {
        if(_invoiceDao == null) {
          _invoiceDao = new InvoiceDao_Impl(this);
        }
        return _invoiceDao;
      }
    }
  }

  @Override
  public PaymentDao getPaymentDao() {
    if (_paymentDao != null) {
      return _paymentDao;
    } else {
      synchronized(this) {
        if(_paymentDao == null) {
          _paymentDao = new PaymentDao_Impl(this);
        }
        return _paymentDao;
      }
    }
  }

  @Override
  public SpendDao getSpendDao() {
    if (_spendDao != null) {
      return _spendDao;
    } else {
      synchronized(this) {
        if(_spendDao == null) {
          _spendDao = new SpendDao_Impl(this);
        }
        return _spendDao;
      }
    }
  }
}
