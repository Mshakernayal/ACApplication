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
import com.example.acapplication.model.entity.SpendEntity;
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
public final class SpendDao_Impl implements SpendDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SpendEntity> __insertionAdapterOfSpendEntity;

  private final EntityDeletionOrUpdateAdapter<SpendEntity> __deletionAdapterOfSpendEntity;

  private final EntityDeletionOrUpdateAdapter<SpendEntity> __updateAdapterOfSpendEntity;

  public SpendDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSpendEntity = new EntityInsertionAdapter<SpendEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `spend` (`details`,`totalMoney`,`notice`,`dailyDetailsId`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SpendEntity value) {
        if (value.getDetails() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDetails());
        }
        stmt.bindLong(2, value.getTotalMoney());
        if (value.getNotice() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNotice());
        }
        stmt.bindLong(4, value.getDailyDetailsId());
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getId());
        }
      }
    };
    this.__deletionAdapterOfSpendEntity = new EntityDeletionOrUpdateAdapter<SpendEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `spend` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SpendEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfSpendEntity = new EntityDeletionOrUpdateAdapter<SpendEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `spend` SET `details` = ?,`totalMoney` = ?,`notice` = ?,`dailyDetailsId` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SpendEntity value) {
        if (value.getDetails() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDetails());
        }
        stmt.bindLong(2, value.getTotalMoney());
        if (value.getNotice() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNotice());
        }
        stmt.bindLong(4, value.getDailyDetailsId());
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final SpendEntity spendEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSpendEntity.insert(spendEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final SpendEntity spendEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSpendEntity.handle(spendEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final SpendEntity spendEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSpendEntity.handle(spendEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getSpendByDailyDetailsId(final int dailyDetailsId,
      final Continuation<? super SpendEntity> continuation) {
    final String _sql = "SELECT * From spend Where dailyDetailsId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dailyDetailsId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<SpendEntity>() {
      @Override
      public SpendEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "details");
          final int _cursorIndexOfTotalMoney = CursorUtil.getColumnIndexOrThrow(_cursor, "totalMoney");
          final int _cursorIndexOfNotice = CursorUtil.getColumnIndexOrThrow(_cursor, "notice");
          final int _cursorIndexOfDailyDetailsId = CursorUtil.getColumnIndexOrThrow(_cursor, "dailyDetailsId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final SpendEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpDetails;
            if (_cursor.isNull(_cursorIndexOfDetails)) {
              _tmpDetails = null;
            } else {
              _tmpDetails = _cursor.getString(_cursorIndexOfDetails);
            }
            final int _tmpTotalMoney;
            _tmpTotalMoney = _cursor.getInt(_cursorIndexOfTotalMoney);
            final String _tmpNotice;
            if (_cursor.isNull(_cursorIndexOfNotice)) {
              _tmpNotice = null;
            } else {
              _tmpNotice = _cursor.getString(_cursorIndexOfNotice);
            }
            final int _tmpDailyDetailsId;
            _tmpDailyDetailsId = _cursor.getInt(_cursorIndexOfDailyDetailsId);
            _result = new SpendEntity(_tmpDetails,_tmpTotalMoney,_tmpNotice,_tmpDailyDetailsId);
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
