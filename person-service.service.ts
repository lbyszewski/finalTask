import { Injectable } from '@angular/core';
import {Person} from "./person";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PersonServiceService {

  person: Person;
  private personSave: string;
  private personind: string;
  private personById: string;
  private  editPerson: string;
  private deletePerson: string;

  constructor(private http: HttpClient) {
    this.personSave = 'http://localhost:6666/perosn/save';
    this.personind = 'http://localhost:6666/person/';
    this.personById = 'http://localhost:5858/shop/shopClient/';
    this.editPerson = 'http://localhost:5858/shop/updateShopClient/update';
    this.deletePerson = 'http://localhost:5858/shop/deleteEntityRow';
  }



  public findById(personId: number): Observable<any>{
    return this.http.get<any>(this.personById + personId);
  }
  // tslint:disable-next-line:typedef
  public savePerson(person: Person) {
    return this.http.post<Person>(this.personSave, person);
  }
  public updatePerson(personId: number , value: any): Observable<any>{
    return this.http.put(`${this.editPerson}/${personId}`, value);
  }
  public deleteById(personId: number): Observable<any>{
    return this.http.delete(`${this.deletePerson}/${personId}`);
  }
}
