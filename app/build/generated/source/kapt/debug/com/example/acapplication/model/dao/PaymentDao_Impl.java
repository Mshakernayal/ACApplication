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
import com.example.acapplication.model.entity.PaymentEntity;
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
public final class PaymentDao_Impl implements PaymentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PaymentEntity> __insertionAdapterOfPaymentEntity;

  private final EntityDeletionOrUpdateAdapter<PaymentEntity> __deletionAdapterOfPaymentEntity;

  private final EntityDeletionOrUpdateAdapter<PaymentEntity> __updateAdapterOfPaymentEntity;

  public PaymentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPaymentEntity = new EntityInsertionAdapter<PaymentEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `payment` (`name`,`totalMoney`,`notice`,`dailyDetailsId`,`PaymentState`,`id`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PaymentEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getTotalMoney());
        if (value.getNotice() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNotice());
        }
        stmt.bindLong(4, value.getClientId());
        stmt.bindLong(5, value.getPaymentState());
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
    this.__deletionAdapterOfPaymentEntity = new EntityDeletionOrUpdateAdapter<PaymentEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `payment` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PaymentEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfPaymentEntity = new EntityDeletionOrUpdateAdapter<PaymentEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `payment` SET `name` = ?,`totalMoney` = ?,`notice` = ?,`dailyDetailsId` = ?,`PaymentState` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PaymentEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getTotalMoney());
        if (value.getNotice() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNotice());
        }
        stmt.bindLong(4, value.getClientId());
        stmt.bindLong(5, value.getPaymentState());
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final PaymentEntity paymentEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPaymentEntity.insert(paymentEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final PaymentEntity paymentEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPaymentEntity.handle(paymentEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final PaymentEntity paymentEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfPaymentEntity.handle(paymentEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getPaymentByDailyDetailsId(final int dailyDetailsId,
      final Continuation<? super PaymentEntity> continuation) {
    final String _sql = "SELECT * From payment Where dailyDetailsId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dailyDetailsId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<PaymentEntity>() {
      @Override
      public PaymentEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTotalMoney = CursorUtil.getColumnIndexOrThrow(_cursor, "totalMoney");
          final int _cursorIndexOfNotice = CursorUtil.getColumnIndexOrThrow(_cursor, "notice");
          final int _cursorIndexOfClientId = CursorUtil.getColumnIndexOrThrow(_cursor, "dailyDetailsId");
          final int _cursorIndexOfPaymentState = CursorUtil.getColumnIndexOrThrow(_cursor, "PaymentState");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final PaymentEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpTotalMoney;
            _tmpTotalMoney = _cursor.getInt(_cursorIndexOfTotalMoney);
            final String _tmpNotice;
            if (_cursor.isNull(_cursorIndexOfNotice)) {
              _tmpNotice = null;
            } else {
              _tmpNotice = _cursor.getString(_cursorIndexOfNotice);
            }
            final int _tmpClientId;
            _tmpClientId = _cursor.getInt(_cursorIndexOfClientId);
            final char _tmpPaymentState;
            _tmpPaymentState = (char) _cursor.getInt(_cursorIndexOfPaymentState);
            _result = new PaymentEntity(_tmpName,_tmpTotalMoney,_tmpNotice,_tmpClientId,_tmpPaymentState);
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
