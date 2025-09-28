import { Injectable } from '@angular/core';
import { jsPDF } from 'jspdf';
import * as xlsx from 'xlsx';
import { ngxCsv } from 'ngx-csv/ngx-csv';


@Injectable({
  providedIn: 'root'
})
export class PrinterService {

  constructor() { }


  defaultBrowserPrint() { window.print(); }

  printToPDF(data: any, fileName: string) {
    /* create a pdf with format options : can be customized LATER */
    let pdf = new jsPDF('l', "pt", 'a3');
    pdf.html(data, { callback: (pdf) => { pdf.save(fileName) }, });
  }

  printToEXCEL(data: any, fileName: string) {
    /* generate a workSheet and populate it with table data */
    const ws: xlsx.WorkSheet = xlsx.utils.table_to_sheet(data);

    /* generate a workbook and add the worksheet to it */
    const wb: xlsx.WorkBook = xlsx.utils.book_new();
    xlsx.utils.book_append_sheet(wb, ws, 'Sheet1');

    /* save to file */
    xlsx.writeFile(wb, fileName)
  }


  printToCSV(data: any, fileName: string) {
    var options = {
      fieldSeparator: ',',
      quoteStrings: '"',
      decimalseparator: '.',
      showLabels: true,
      showTitle: true,
      title: fileName,
      useBom: true,
      noDownload: false,
      headers: Object.keys(data[0]),
    };
    new ngxCsv(data, fileName, options);
  }


}
