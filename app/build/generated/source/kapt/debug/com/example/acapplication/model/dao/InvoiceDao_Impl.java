package com.example.acapplication.model.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.acapplication.model.entity.InvoiceEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class InvoiceDao_Impl implements InvoiceDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<InvoiceEntity> __insertionAdapterOfInvoiceEntity;

  private final EntityDeletionOrUpdateAdapter<InvoiceEntity> __deletionAdapterOfInvoiceEntity;

  private final EntityDeletionOrUpdateAdapter<InvoiceEntity> __updateAdapterOfInvoiceEntity;

  public InvoiceDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfInvoiceEntity = new EntityInsertionAdapter<InvoiceEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `invoice` (`name`,`itemType`,`number`,`meter`,`price`,`spend`,`notice`,`invoiceState`,`dailyDetailsId`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InvoiceEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getItemType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getItemType());
        }
        stmt.bindLong(3, value.getNumber());
        stmt.bindLong(4, value.getMeter());
        stmt.bindLong(5, value.getPrice());
        if (value.getSpend() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSpend());
        }
        if (value.getNotice() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNotice());
        }
        stmt.bindLong(8, value.getInvoiceState());
        stmt.bindLong(9, value.getDailyDetailsId());
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getId());
        }
      }
    };
    this.__deletionAdapterOfInvoiceEntity = new EntityDeletionOrUpdateAdapter<InvoiceEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `invoice` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InvoiceEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfInvoiceEntity = new EntityDeletionOrUpdateAdapter<InvoiceEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `invoice` SET `name` = ?,`itemType` = ?,`number` = ?,`meter` = ?,`price` = ?,`spend` = ?,`notice` = ?,`invoiceState` = ?,`dailyDetailsId` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, InvoiceEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getItemType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getItemType());
        }
        stmt.bindLong(3, value.getNumber());
        stmt.bindLong(4, value.getMeter());
        stmt.bindLong(5, value.getPrice());
        if (value.getSpend() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getSpend());
        }
        if (value.getNotice() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNotice());
        }
        stmt.bindLong(8, value.getInvoiceState());
        stmt.bindLong(9, value.getDailyDetailsId());
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final InvoiceEntity invoiceEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfInvoiceEntity.insert(invoiceEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final InvoiceEntity invoiceEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfInvoiceEntity.handle(invoiceEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final InvoiceEntity invoiceEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfInvoiceEntity.handle(invoiceEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getInvoiceByDailyDetailsId(final int dailyDetailsId,
      final Continuation<? super InvoiceEntity> continuation) {
    final String _sql = "SELECT * From invoice Where dailyDetailsId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dailyDetailsId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<InvoiceEntity>() {
      @Override
      public InvoiceEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfItemType = CursorUtil.getColumnIndexOrThrow(_cursor, "itemType");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
          final int _cursorIndexOfMeter = CursorUtil.getColumnIndexOrThrow(_cursor, "meter");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfSpend = CursorUtil.getColumnIndexOrThrow(_cursor, "spend");
          final int _cursorIndexOfNotice = CursorUtil.getColumnIndexOrThrow(_cursor, "notice");
          final int _cursorIndexOfInvoiceState = CursorUtil.getColumnIndexOrThrow(_cursor, "invoiceState");
          final int _cursorIndexOfDailyDetailsId = CursorUtil.getColumnIndexOrThrow(_cursor, "dailyDetailsId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final InvoiceEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpItemType;
            if (_cursor.isNull(_cursorIndexOfItemType)) {
              _tmpItemType = null;
            } else {
              _tmpItemType = _cursor.getString(_cursorIndexOfItemType);
            }
            final int _tmpNumber;
            _tmpNumber = _cursor.getInt(_cursorIndexOfNumber);
            final int _tmpMeter;
            _tmpMeter = _cursor.getInt(_cursorIndexOfMeter);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final Integer _tmpSpend;
            if (_cursor.isNull(_cursorIndexOfSpend)) {
              _tmpSpend = null;
            } else {
              _tmpSpend = _cursor.getInt(_cursorIndexOfSpend);
            }
            final String _tmpNotice;
            if (_cursor.isNull(_cursorIndexOfNotice)) {
              _tmpNotice = null;
            } else {
              _tmpNotice = _cursor.getString(_cursorIndexOfNotice);
            }
            final char _tmpInvoiceState;
            _tmpInvoiceState = (char) _cursor.getInt(_cursorIndexOfInvoiceState);
            final int _tmpDailyDetailsId;
            _tmpDailyDetailsId = _cursor.getInt(_cursorIndexOfDailyDetailsId);
            _result = new InvoiceEntity(_tmpName,_tmpItemType,_tmpNumber,_tmpMeter,_tmpPrice,_tmpSpend,_tmpNotice,_tmpInvoiceState,_tmpDailyDetailsId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
