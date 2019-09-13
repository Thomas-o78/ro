import {
  ActionReducer,
  ActionReducerMap,
  createFeatureSelector,
  createSelector,
  MetaReducer
} from '@ngrx/store';

import { RefsAG, RefActeGestion } from './ref-acte-gestion/ref-acte-gestion.model';
import * as refs from './ref-acte-gestion/ref-acte-gestion.reducers';

import { RefsA, RefActivite } from './ref-activite/ref-activite.model';
import * as refsAct from './ref-activite/ref-activite.reducers';

import { RefsSA, RefSActivite } from './ref-secteur-activite/ref-secteur-activite.model';
import * as refsSAct from './ref-secteur-activite/ref-secteur-activite.reducers';
import { Filter } from './filter/filter.model';
import * as currentFilter from './filter/filter.reducers';
import { select } from '@ngrx/store';
import { map } from 'rxjs/operators';
import * as errors from './errors/errors.reducer';
import { Errors } from './errors/errors.model';

export interface RefsState extends RefsAG {}

export const reducer: ActionReducerMap<RefsState> = {
  refs : refs.refreducer,
};
export interface RefsACTState extends RefsA {}
export const reducerAct: ActionReducerMap<RefsACTState> = {
  refs : refsAct.Activitereducer,
}

export interface RefsSACT extends RefsSA {}
export const reducerSA: ActionReducerMap<RefsSACT> = {
  refs : refsSAct.SActivitereducer,

}

export const getTodos = s => s.todos;
export const getRefs = s => s.refs;


