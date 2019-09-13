import { Component, OnInit } from '@angular/core';
import {ModalHelperService} from '../services/modal.helper.service';
import {CreationComponent} from '../modal/creation/creation.component';
import {Parameters} from "../app.parameter";

import {ConsulterComponent} from '../modal/consulter/consulter.component';


@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  constructor( private modalHelperService: ModalHelperService) { }

  ngOnInit() {
  }
  get urlLogo(): string {
    return Parameters.urlLogo;
  }
  public openModalCreation(): void {
    this.modalHelperService
      .openXlModal(CreationComponent);
  }
  public openModalConsulter(): void {
    this.modalHelperService
      .openXlModal(ConsulterComponent);
  }

}
