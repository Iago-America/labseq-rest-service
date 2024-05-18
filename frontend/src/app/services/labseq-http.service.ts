import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LabseqHttpService {

  private apiUrl = 'http://localhost:8080/labseq';

  constructor(private http: HttpClient) { }

  getLabseqValue(number: number): Observable<string> {
    return this.http.get<string>(`${this.apiUrl}/${number}`);
  }
}
