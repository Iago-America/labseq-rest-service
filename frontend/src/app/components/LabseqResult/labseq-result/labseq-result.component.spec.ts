import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LabseqResultComponent } from './labseq-result.component';

describe('LabseqResultComponent', () => {
  let component: LabseqResultComponent;
  let fixture: ComponentFixture<LabseqResultComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LabseqResultComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LabseqResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
