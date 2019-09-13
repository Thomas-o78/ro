export interface RefActeGestion {

  code: number;
  libelleCourt: string;
  libelleLong: string;
  commentaire: string;
}

export interface RefsAG {
  refs: Array<RefActeGestion>;
}
