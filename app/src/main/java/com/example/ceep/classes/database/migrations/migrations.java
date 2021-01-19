package com.example.ceep.classes.database.migrations;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class migrations {
    public static final Migration [] MIGRATION  = {new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE IF NOT EXISTS `Nota_nova` (" +
                    "`titulo` TEXT, " +
                    "`descricao` TEXT, " +
                    "`posicao` INTEGER NOT NULL," +
                    " `corPadrao` TEXT, " +
                    "`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            database.execSQL("DROP TABLE Nota");
            database.execSQL("ALTER TABLE Nota_nova RENAME TO Nota");
        }
    }};

}
