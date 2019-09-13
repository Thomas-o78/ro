import { Action } from '@ngrx/store';
import { RefActeGestion } from './ref-acte-gestion.model';

export enum RefActionTypes {
  AddRef = '[REF] Rajout Ref Acte Gestion',
  AddRefEffect = '[Todo] Add Todo Effect',
  AddRefEffectSuccess = '[Todo] Add Todo Effect Success',
  AddRefEffectFailure = '[Todo] Add Todo Effect Failure',
  ToggleRef = '[Todo] Toggle Todo',
  DeleteRef = '[Todo] Delete Todo',
}

let currentId = 1;

export class AddRef implements Action {
  readonly type = RefActionTypes.AddRef;


  constructor(public payload: RefActeGestion) {
  }
}



export class AddRefEffectSuccess implements Action {
  readonly type = RefActionTypes.AddRefEffectSuccess;
}

export class AddRefEffectFailure implements Action {
  readonly type = RefActionTypes.AddRefEffectFailure;
}

export class ToggleRef implements Action {
  readonly type = RefActionTypes.ToggleRef;

  constructor(public payload: { id: number }) {}
}

export class DeleteRef implements Action {
  readonly type = RefActionTypes.DeleteRef;

  constructor(public payload: { id: number }) {}
}


export type RefActions = AddRef | AddRefEffectSuccess | AddRefEffectFailure | ToggleRef | DeleteRef;
