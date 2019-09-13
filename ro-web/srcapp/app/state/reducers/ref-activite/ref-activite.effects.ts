import { Injectable } from '@angular/core';
import { Actions, Effect, ofType } from '@ngrx/effects';
import { Observable, timer, of } from 'rxjs';
import { map, tap, mergeMap, catchError } from 'rxjs/operators';
import { AddRef } from './ref-activite.action';
import { ErrorsActionTypes, SetError, ErrorsActions } from '../errors/errors.actions';

@Injectable()
export class RefEffects {
  constructor(
    private actions$: Actions
  ) { }

  @Effect()
  addTodoAsync$ = null;

}
