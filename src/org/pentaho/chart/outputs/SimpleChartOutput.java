package org.pentaho.chart.outputs;

import org.pentaho.chart.api.engine.Chart;
import org.pentaho.chart.api.engine.Output;
import org.pentaho.chart.api.exceptions.PersistenceException;
import org.pentaho.chart.messages.Messages;

public class SimpleChartOutput implements Output {
  
  private Chart chart;
  
  public SimpleChartOutput(){
  }

  public SimpleChartOutput(Chart chart){
    this.chart = chart;
  }

  public Chart getChart() {
    return chart;
  }

  public void setChart(Chart chart) {
    this.chart = chart;
  }

  /* (non-Javadoc)
   * @see org.pentaho.chart.api.engine.Output#persist()
   */
  public void persist() throws PersistenceException {
    throw new PersistenceException(
        new UnsupportedOperationException(Messages.getString("SimpleChartOutput.ERROR_0001_PERSISTENCE_NOT_SUPPORTED"))); //$NON-NLS-1$
  }
}
