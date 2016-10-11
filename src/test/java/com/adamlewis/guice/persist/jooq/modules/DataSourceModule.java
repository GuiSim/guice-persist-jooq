package com.adamlewis.guice.persist.jooq.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.jooq.SQLDialect;

import javax.sql.DataSource;

import static org.mockito.Mockito.*;

public class DataSourceModule extends AbstractModule {
  public static final SQLDialect DEFAULT_DIALECT = SQLDialect.SQLITE;

  protected void configure() {
    binder().requireExplicitBindings();
    bind(SQLDialect.class).toInstance(DEFAULT_DIALECT);
  }

  @Provides
  public DataSource mockDataSource(){
    return mock(DataSource.class);
  }
}
