import { RefActeGestion, RefsAG } from './ref-acte-gestion.model';
import { RefActions, RefActionTypes } from './ref-acte-gestion.action';

export const initialState: Array<RefActeGestion> = [];
export const refreducer = (state = initialState, action: RefActions): Array<RefActeGestion> => {
  switch (action.type) {
    case RefActionTypes.AddRef:
      return state.concat(<RefActeGestion>{

        libelleCourt: action.payload.libelleCourt,
        libelleLong: action.payload.libelleLong,
        commentaire: action.payload.commentaire,
        code: action.payload.code
      });

    default:
      return state;
  }
};


